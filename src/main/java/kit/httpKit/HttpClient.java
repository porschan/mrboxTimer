package kit.httpKit;

import com.jfinal.plugin.activerecord.Record;
import org.apache.http.HttpResponse;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * @author:porschan
 * @description:
 * @date: Created in 10:26 2018/7/27
 * @modified By:
 */

public class HttpClient {
    DefaultHttpClient client = new DefaultHttpClient();

    public HttpClient() {
        CredentialsProvider credsProvider = new BasicCredentialsProvider();
        client.setCredentialsProvider(credsProvider);
    }


    public Record get(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        String strResult = EntityUtils.toString(response.getEntity());
        int statusCode = response.getStatusLine().getStatusCode();
        Record record = new Record().set("statusCode", statusCode).set("data", strResult);
        return record;

    }

    public Record post(String url, String json, Map<String,String>... header) throws IOException {
        HttpPost request = new HttpPost(url);
        if (header != null && header.length > 0) {
            for (String s : header[0].keySet()) {
                request.setHeader(s,header[0].get(s));
            }
        }
        request.setEntity(new StringEntity(json, Charset.forName("UTF-8")));
        HttpResponse response = client.execute(request);
        String strResult = EntityUtils.toString(response.getEntity());
        int statusCode = response.getStatusLine().getStatusCode();
        Record record = new Record().set("statusCode", statusCode).set("data", strResult);
        return record;
    }
}

import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main2 {
    public static void main(String[] args) {
        try {
            // 検索キーワードをCQL形式で設定
            String query = "title = Java"; // CQLフォーマット
            String encodedQuery = URLEncoder.encode(query, "UTF-8");

            // 国立国会図書館APIのエンドポイント
            String endpoint = "https://ndlsearch.ndl.go.jp/api/sru";

            // APIリクエストのURLを構築
            String requestUrl = endpoint + "?operation=searchRetrieve"
                + "&version=1.2"
                + "&query=" + encodedQuery
                + "&maximumRecords=10"
                + "&recordSchema=dc";
            // ここにコードを書いてください
            URL url = new URL(requestUrl);

            HttpClient client = HttpClient.newBuilder()
            .version(Version.HTTP_1_1)
            .followRedirects(Redirect.NORMAL)
            .build();

            HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(requestUrl))
            .GET()
            .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            int status = response.statusCode();
    
            System.out.println("Status Code: " + status);
            System.out.println("Response Body: " + body);
    
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

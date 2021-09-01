import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class Example {
    public static void main(String[] args) {
        Cluster cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        Session session = cluster.connect("killrvideo");
        ResultSet results = session.execute("SELECT * FROM videos");

        for (Row row:
             results) {
            System.out.println(row.getString("title"));
        }
    }
}

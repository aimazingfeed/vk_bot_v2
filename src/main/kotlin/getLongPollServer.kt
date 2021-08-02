import org.json.JSONObject
import java.net.URL

fun getLongPollServer(access_token: String, group_id: String ): LongPollServer {
    val url = URL("https://api.vk.com/method/groups.getLongPollServer?" +
            "group_id=$group_id&access_token=$access_token&v=5.131").readText()
    val data = JSONObject(url)
    val response = data.getJSONObject("response")
    val server = response.getString("server")
    val key = response.getString("key")
    val ts = response.getString("ts")

    return LongPollServer(server,key,ts)
}
import org.json.JSONObject
import java.net.URL
import java.util.*

fun getMessage(server : String, key: String, ts: String, access_token: String){
    val url = URL("$server?act=a_check&key=$key&wait=25&mode=2&ts=$ts").readText()
    val data = JSONObject(url)
    val updates = data.getJSONArray("updates")
    if (!updates.isEmpty) {
        for (i in 0 until updates.length()) {
            val item = updates.getJSONObject(i)
            val obj = item.getJSONObject("object")
            val message = obj.getJSONObject("message")
            val random = Random().nextInt(999999)
            val text = message.getString("text")
            val strs = text.split(" ").toTypedArray()
            val strBuilder = StringBuilder()
            for (i in 0 until strs.lastIndex+1) {
                strBuilder.append(strs.get(i))
                if (i!=strs.lastIndex)
                    strBuilder.append('+')
            }
            val txt = strBuilder.toString()
            val from_id = message.getInt("from_id")
            val url = URL("https://api.vk.com/method/messages.send?user_id=$from_id&message="+"Вы+написали:+"+"$txt&random_id=$random&" +
                    "access_token=$access_token&v=5.131").readText()
        }
    }
}

fun main() {
    val group_id = ""
    val access_token = ""
    while(true) {
        val data = getLongPollServer(access_token, group_id)
        val message = getMessage(data.server, data.key, data.ts, access_token)
    }
}





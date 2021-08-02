fun main() {
    val group_id = ""
    val access_token = ""
    while(true) {
        var data = getLongPollServer(access_token, group_id)
        var message = getMessage(data.server, data.key, data.ts, access_token)
    }
}





namespace java com.iflytek.tts
// namespace cpp com.iflytek.tts
struct Request{
2: required string str;
1: required bool isFile;
3: required string outputPath;
}
struct Response{
1: i64 startTime;
2: i64 endTime;
3: string status;
}
service CallTTSservice{
Response callTTS(1:Request request)
}

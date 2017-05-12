namespace java com.iflytek.thrift.demo
service ThriftTest{
 void testVoid();
 string testString(1:string thing);
}

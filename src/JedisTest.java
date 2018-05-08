import org.junit.Test;
import redis.clients.jedis.Jedis;

public class JedisTest {

    @Test
    public void test(){
        //获得连接对象
        Jedis jedis = new Jedis("localhost",6379);
        //获得数据
        jedis.set("username", "wzh");
        String username = jedis.get("username");
        System.out.println(username);
        //存储
        jedis.set("addr","北京");
        System.out.println(jedis.get("addr"));
    }
    @Test
    public void test1() {
        Jedis jedis = JedisPoolUtils.getJedis();
        jedis.set("password","123456");
        System.out.println(jedis.get("password"));
    }
    @Test
    public void test2(){
        Jedis jedis = JedisPoolUtils.getJedis();
        jedis.set("username", "123");
        System.out.println(jedis.get("username"));
    }
}

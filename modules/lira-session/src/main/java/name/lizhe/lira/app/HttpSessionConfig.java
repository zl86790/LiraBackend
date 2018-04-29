package name.lizhe.lira.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

import redis.clients.jedis.JedisPoolConfig;

@EnableRedisHttpSession
public class HttpSessionConfig {
    
    
    @Autowired
    private JedisPoolConfig jpc;
    
    @Bean
    public JedisPoolConfig getJedisPoolConfig() {
        return new redis.clients.jedis.JedisPoolConfig();
    }
    
    @Bean
    public JedisConnectionFactory getJedisConnectionFactory(){
        JedisConnectionFactory jcf = new org.springframework.data.redis.connection.jedis.JedisConnectionFactory();
        jcf.setHostName("lizhe.name");
        jcf.setPort(8089);
        jcf.setPassword("");
        jcf.setUsePool(true);
        jcf.setPoolConfig(jpc);
        return jcf;
    }
}
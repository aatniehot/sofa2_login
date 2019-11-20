package sofa2.login.Controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import sofa2.login.Model.User;

@RestController
public class AceController {
    @Autowired
    RestTemplate rest;

    public String getLogin(User user){
        String url = "http://localhost:7800/loginapi/v1/login?user="+user.getUsername()+"&pass="+user.getPassword();
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<User> entity = new HttpEntity<User>(headers);
            return rest.exchange(url, HttpMethod.GET, entity, String.class).getBody();
        }
        public String postLogin(User user) {
            String url = "http://localhost:7800/loginapi/v1/login";
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            Map<String, Object> map = new HashMap<>();
            map.put("username", user.getUsername());
            map.put("password", user.getPassword());
        
            // build the request
            HttpEntity<Map<String, Object>> entity = new HttpEntity<>(map, headers);
            // HttpEntity<Client> entity = new HttpEntity<Client>(client,headers);
            
            return rest.exchange(
               url, HttpMethod.POST, entity, String.class).getBody();
         }


}

package hello.springmvc.basic.requestmapping;

import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/hello-basic", method = RequestMethod.GET)
    public String helloBasic() {

        log.info("hellobasic");
        return "OK";
    }

    @GetMapping("/mapping-get-v2")
    public String mappingGetV2() {
        log.info("getmapping");
        return "OOK";
    }

    @RequestMapping("/mapping/{userid}")
    public String mappingPath(@PathVariable String userid) {
        log.info("mappingpath userid={}", userid);
        return "OOOK";

    }
    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long
            orderId) {
        log.info("mappingPath userId={}, orderId={}", userId, orderId);
        return "ok";
    }
}



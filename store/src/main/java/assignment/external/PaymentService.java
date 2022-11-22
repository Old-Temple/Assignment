package assignment.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name = "payMent", url = "${api.url.payMent}")
public interface PaymentService {
    @RequestMapping(method= RequestMethod.POST, path="/payments")
    public void payCancle(@RequestBody Payment payment);
}

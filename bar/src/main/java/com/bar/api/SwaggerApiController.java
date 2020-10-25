package com.bar.api;

import com.common.endpoint.PokerBarApiEndpoints;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SwaggerApiController {

    @GetMapping(PokerBarApiEndpoints.ROOT)
    public RedirectView index(){
        return new RedirectView(PokerBarApiEndpoints.SWAGGER_UI);
    }

}

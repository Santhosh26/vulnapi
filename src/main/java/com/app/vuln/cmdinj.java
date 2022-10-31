package com.app.vuln;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@RestController

public class cmdinj {
        @GetMapping("/cmd/{data}")
        public String cmd(@PathVariable String data){
            Process a=null;
            String s=null;

            Runtime cmd = Runtime.getRuntime();
            try{
               a = cmd.exec(new String[]{"cmd.exe","/c",data});
                BufferedReader stdInput = new BufferedReader(new
                        InputStreamReader(a.getInputStream()));
                BufferedReader stdError = new BufferedReader(new
                        InputStreamReader(a.getErrorStream()));


                while ((s = stdInput.readLine()) != null) {
                    System.out.println(s);
                    return s;
                }


            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return s;

        }
}

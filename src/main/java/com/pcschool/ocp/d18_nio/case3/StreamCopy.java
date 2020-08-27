
package com.pcschool.ocp.d18_nio.case3;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class StreamCopy {
    public static void main(String[] args) throws Exception {
        String surl = "https://s.zimedia.com.tw/s/NdJuAZ-0";
        URI uri = URI.create(surl);
        Path dest = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio");
        Files.copy(uri.toURL().openStream(), dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copy 成功!");
    }
}
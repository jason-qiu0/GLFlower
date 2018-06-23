//package  com.example.demo.excel    ;
//import com.example.demo.excel.ExcelUtil;
//import com.example.demo.excel.entity.ExcelUserInfo;
//import com.example.demo.excel.entity.WebDto;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.io.FileOutputStream;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class ExportExcelTest {
//
//    @Test
//    public void test() throws Exception {
//        List<WebDto> list = new ArrayList<WebDto>();
//
//        ExcelUserInfo a=new ExcelUserInfo();
//        list.add(new WebDto("权限系统", "http://basic.zslin.com", "admin", "111111", 111));
//        list.add(new WebDto("校园网", "http://school.zslin.com", "admin", "222222", 333));
//
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("title", "网站信息表");
//        map.put("total", list.size()+" 条");
//        map.put("date", getDate());
//
//        ExcelUtil.getInstance().exportObj2ExcelByTemplate(map, "web-info-template.xls", new FileOutputStream("D:/temp/out.xls"),
//                list, WebDto.class, true);
//    }
//
//    private String getDate() {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
//        return sdf.format(new Date());
//    }
//}
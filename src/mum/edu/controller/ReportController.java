//package mum.edu.controller;
//
//import mum.edu.Services.MyFinanceService;
//import mum.edu.domain.MyFinance;
//import mum.edu.domain.Product;
//import net.sf.jasperreports.engine.JRDataSource;
//import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
// 
//@Controller
//@RequestMapping("/report/")
//public class ReportController {
// 
// 
//    private static final Logger logger = LoggerFactory.getLogger("controller");
// 
//    @Autowired
//    MyFinanceService myFinanceService;
// 
//    @RequestMapping(method = RequestMethod.GET , value = "pdf")
//    public ModelAndView generatePdfReport(ModelAndView modelAndView){
// 
//        logger.debug("--------------generate PDF report----------");
// 
//        Map<String,Object> parameterMap = new HashMap<String,Object>();
// 
//        List<MyFinance> myFinanceReportList = myFinanceService.getAll();
// 
//        JRDataSource JRdataSource = new JRBeanCollectionDataSource(myFinanceReportList);
// 
//        parameterMap.put("datasource", JRdataSource);
// 
//        //pdfReport bean has ben declared in the jasper-views.xml file
//        modelAndView = new ModelAndView("pdfReport", parameterMap);
// 
//        return modelAndView;
// 
//    }//generatePdfReport
//    
//}
// 

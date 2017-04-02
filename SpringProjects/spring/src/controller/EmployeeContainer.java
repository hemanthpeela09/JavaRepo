package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import form.Contact;
import form.Employee;

@Controller
public class EmployeeContainer {
 
    @RequestMapping(value = "/employeedetails", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("employee")
                            Employee employee, @ModelAttribute("contact")
                            Contact contact, ModelMap model) {
         
        System.out.println("associate id:" + employee.getAssociateid());
        
        System.out.println("department:" + employee.getDepartment());
        
        Map map = new HashMap();        
         map.put("contact", contact);
         map.put("employee", employee);
         
         model.put("employeedetails", map);
         /*instead of map, employee and contact can also be direct put in model */
         
         model.put("contact", contact);
         model.put("employee", employee);
         
        return "employeedetails";
    }
     
    @RequestMapping("/employee")
    public String showContacts() {
         
        return "employee";
    }
}

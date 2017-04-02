package controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import form.Address;
import form.Contact;
import form.Demographics;
 
@Controller
public class ContactController {
 
    @RequestMapping(value = "/addContact", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("demographics")
                            Demographics demographics, ModelMap model) {
         
        System.out.println("First Name:" + demographics.getContact().getFirstname() + 
                    " Last Name:" + demographics.getContact().getLastname());
        
        System.out.println("Street:" + demographics.getAddress().getStreet() + 
                " City:" + demographics.getAddress().getCity());
        
        System.out.println("Contact email: " + demographics.getContact().getEmail() + ", Address email: " + demographics.getAddress().getEmail());
        
        model.addAttribute("contact",demographics.getContact());
        model.addAttribute("address",demographics.getAddress()); 
         Map map = new HashMap();
         map.put("contact", demographics.getContact());
         map.put("address", demographics.getAddress());
        return "contactdetails";
    }
     
    @RequestMapping("/contacts")
    public ModelAndView showContacts() {
         Demographics dg = new Demographics();
         dg.setAddress(new Address());
         dg.setContact(new Contact());
        return new ModelAndView("contact", "command", new Demographics());
    }
}

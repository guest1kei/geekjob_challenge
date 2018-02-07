/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge11;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class challenge11for5 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    HashMap<String, String> profile(int a) {

        HashMap<String, String> user1 = new HashMap<>();
        HashMap<String, String> user2 = new HashMap<>();
        HashMap<String, String> user3 = new HashMap<>();

        user1.put("ID", "1");
        user1.put("名前", "u");
        user1.put("生年月日", "1月1日");
        user1.put("住所", "東京");
        user2.put("ID", "2");
        user2.put("名前", "w");
        user2.put("生年月日", "2月2日");
        user2.put("住所", "千葉");
        user3.put("ID", "3");
        user3.put("名前", "b");
        user3.put("生年月日", "3月3日");
        user3.put("住所", "埼玉");

        if (a == 1) {
            return user1;
        } else if (a == 2) {
            return user2;
        } else {
            return user3;
        }

    }
    
 //   ArrayList<String> getProfile1(int id){
   //     ArrayList<String> profile = new ArrayList<String>();
        
       // if( id == 1 ){
           // profile.add("1");
            //profile.add("tanaka");
           // profile.add("chiba");
            
           // return profile;

       // } else if ( id == 2 ) {
         
         //   profile.add("2");
         //   profile.add("sato");
         //   profile.add("tokyo");
            
         //   return profile;
                       
      //  } else {
            
        //    profile.add("3");
          //  profile.add("suzuki");
          //  profile.add("saitama");
            
          //  return profile;
       // }
   // }
    
    
  //  ArrayList<String> getProfile2(int id){
        
     //   ArrayList<String> user1 = new ArrayList<String>();
     //   ArrayList<String> user2 = new ArrayList<String>();
     //   ArrayList<String> user3 = new ArrayList<String>();
        
        // ここで地道に add する。
        
      //  if( id == 1 ){
        //    return user1;
      //  } else if( id == 2 ){
        //    return user2;
       // } else {
         //   return user3;
       // }
   // }

    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            HashMap<String, String> datas = profile(0);
             
                out.print(datas.get("名前"));
                out.print(datas.get("生年月日"));
                out.print(datas.get("住所"));

            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

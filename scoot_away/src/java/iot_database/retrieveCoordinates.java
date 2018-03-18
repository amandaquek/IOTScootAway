/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot_database;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.minidev.json.JSONObject;

@WebServlet(name = "retrieveCoordinates", urlPatterns = {"/json/retrieveCoordinates"})
public class retrieveCoordinates extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter writer = response.getWriter();
        JSONObject jsonObj = new JSONObject();
        
        ArrayList<Coordinates> listOfCoordinates = HeatMap.getAllCoordinates();
        ArrayList<JSONObject> fullList = new ArrayList<JSONObject>();
        //jsonObj.put("listOfCoordinates", listOfCoordinates);
        
        System.out.println("===========Something here===========");
        //System.out.println(listOfCoordinates);
        for(int i = 0; i < listOfCoordinates.size(); i++){
            JSONObject coordinates = new JSONObject();
            //Add into coordinates json
            coordinates.put("latitude", listOfCoordinates.get(i).getLatitude());
            coordinates.put("longitude", listOfCoordinates.get(i).getLongitude());
            
            //Put json into ArrayList
            fullList.add(coordinates);
            
            /*"%6f%n"*/
            System.out.println(listOfCoordinates.get(i).getLatitude() + ", " + listOfCoordinates.get(i).getLongitude());
        }
        
        jsonObj.put("listOfCoordinates", fullList);
        
        writer.println(jsonObj.toJSONString());
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


package tw.com.web;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tw.com.web.tools.ImageTools;
@MultipartConfig
@WebServlet("/upload")
public class UploadServlet  extends HttpServlet {
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			//@MultipartConfig 一定要做
			Part part = req.getPart("photo");
			
			String fileName = part.getSubmittedFileName();
			InputStream inputStr = part.getInputStream();
			
			ImageTools.useDefaultImagePathUpload(fileName, inputStr);
			resp.sendRedirect("view_images");
			
		}
}

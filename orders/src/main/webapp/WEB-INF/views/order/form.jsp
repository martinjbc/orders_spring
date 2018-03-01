<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<html>
 
<head>
	<%@ include file="../partials/resource.jsp" %>    
</head>
<body class="hold-transition skin-blue fixed sidebar-mini">
	<div class="wrapper">
	        <header id="header" class="main-header">
			<%@ include file="../partials/header.jsp" %> 
	        </header>
	     
	     	<aside class="main-sidebar">
	        	<section id="sidemenu" class="sidebar">
				<%@ include file="../partials/sidebar.jsp" %>
	        	</section>
	        </aside>
	        
			<div class="content-wrapper">	             
		        <section id="site-content" class="content">


					<div class="box box-primary">
					    <div class="box-header with-border">
					        <h3 class="box-title">Nuevo pedido</h3>
					        <div class="box-tools pull-right">
					            <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
					            <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button>
					        </div>
					    </div>	    
					     
			            <div class="box-body">
			
			
						   <c:url var="actionUrl" value="${action}"/>
						   <form:form action="${actionUrl}" method="post" commandName="projectForm">
						   	  <!--  modelAttribute="project"  -->
							<div class="form-group">
							    <label for="name">Cliente</label>
							    <form:input type="text" class="form-control" path="client" name="client"/>
							    <form:input path="id" type="hidden"/>
							    <font color="red"> <form:errors path="client"></form:errors></font>
							</div>
			                		
							<div class="form-group">
							    <label for="name">Dirección</label>
							    <form:textarea class="form-control" path="address" name="address"/>
							    <font color="red"> <form:errors path="address"></form:errors></font>
							</div>
							
							<div class="form-group">
							    <label for="name">Destinatario</label>
							    <form:textarea class="form-control" path="recipient" name="recipient"/>
							    <font color="red"> <form:errors path="recipient"></form:errors></font>
							</div>
							
									    
						    <div class="box-footer">
						        <div class="form-actions">
						            <form:button name="btn_graba_usu" class="btn btn-primary">Grabar</form:button>
						        </div>
						    </div>		
						    						    		
			                		                			   	  
						   </form:form>
						
					    </div>
					    		       
					</div>




		        </section>
	        </div>
	        <!-- 
	        <footer id="footer">
	            <tiles:insertAttribute name="footer" />
	        </footer>-->
	</div> 
	<%@ include file="../partials/scripts.jsp" %>    	       
</body>
</html>

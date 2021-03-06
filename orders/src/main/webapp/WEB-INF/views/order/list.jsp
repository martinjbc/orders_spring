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
						        <h3 class="box-title">PEDIDOS</h3>
				                <div class="pull-right box-tools">
				                    <a href="<c:url value='/pedido/new'/>" class="btn btn-primary btn-sm" data-toggle="tooltip" title="" data-original-title="Nuevo Usuario">
				                        <i class="fa fa-plus"></i>
				                    </a>
				                </div>
						    </div>
            				<div class="box-body">					            
									<div class="table-responsive">
					                    <table id="editTable" class="table table-striped table-bordered table-hover dataTables-example" >
					                    <thead>
					                    <tr>
					                        <th>Cliente</th>
					                        <th>Direcci�n</th>
					                        <th>Fecha pedido</th>
					                        <th>Fecha entrega</th>
					                        <th>Destinatario</th>
					                    </tr>
					                    </thead>
					                    <tbody>
					                    <c:choose>
									        <c:when test="${orders.size()==0}">
						                    <tr>
						                        <th></th>
						                        <th></th>
						                        <th></th>
						                        <th></th>
						                        <th></th>
						                    </tr>
						                    </c:when>				        
									        <c:otherwise>
									        	<c:forEach items="${orders}" var="order">	                    
								                    <tr class="gradeX">
								                        <td></td>
								                        <td></td>
								                        <td></td>
								                        <td class="center">-</td>
								                        <td class="center"></td>
								                    </tr>
							                    </c:forEach>
							               </c:otherwise>
							            </c:choose>        
					                    </tbody>
					                    <tfoot>
						                    <tr>
						                        <th>Cliente</th>
						                        <th>Direcci�n</th>
						                        <th>Fecha pedido</th>
						                        <th>Fecha entrega</th>
						                        <th>Destinatario</th>					                        
					                        </tr>
					                    </tfoot>
					                    </table>
				                        </div>
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
	
  <script>
        $(document).ready(function() {
            /* Init DataTables */
            var oTable = $('#editTable').DataTable();

            /* Apply the jEditable handlers to the table */
            /*
            oTable.$('td').editable( '../example_ajax.html', {
                "callback": function( sValue, y ) {
                    var aPos = oTable.fnGetPosition( this );
                    oTable.fnUpdate( sValue, aPos[0], aPos[1] );
                },
                "submitdata": function ( value, settings ) {
                    return {
                        "row_id": this.parentNode.getAttribute('id'),
                        "column": oTable.fnGetPosition( this )[2]
                    };
                },

                "width": "90%",
                "height": "100%"
            } );
			*/

        });
</script>		       
</body>
</html>

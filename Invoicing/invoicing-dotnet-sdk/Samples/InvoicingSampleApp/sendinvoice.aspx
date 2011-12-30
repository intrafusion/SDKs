﻿<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="SendInvoice.aspx.cs" Inherits="InvoicingSampleApp.SendInvoice" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>PayPal Invoicing SDK - SendInvoice Sample page</title>
    <link rel="stylesheet" href="sdk.css" type="text/css" />
    <script type="text/javascript" src="sdk.js"></script>    
</head>
<body>
    <h2>SendInvoice API Sample page</h2>
    <form id="form1" runat="server" action="InvoiceHandler.ashx">
        <div class="params">
            <div class="param_name">InvoiceID * (Get Invoice ID via <a href='createinvoice.aspx'>CreateInvoice</a>)</div>
	        <div class="param_value"><input type="text" name="invoiceId" value=""/></div>
	        <!--#include file="permissions.inc"-->
        </div>
		<div class="submit">
			<input type="submit" name="invoiceBtn" value="SendInvoice" /> <br />
		</div>	                    
    </form>
    <a href="Default.aspx">Home</a>
</body>
</html>
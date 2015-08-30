<!DOCTYPE html>
<html lang="en" class="no-js" xmlns:g="http://www.w3.org/1999/html">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>
            <g:if test="${title}">Ken's Pools - ${title}</g:if>
            <g:else><g:layoutTitle/></g:else>
        </title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <asset:stylesheet src="h5bp/normalize-5.2.0.css" />
        <asset:stylesheet src="application.css" />

        <asset:javascript src="jquery-2.1.3.js" />
        <asset:javascript src="h5bp/plugins-5.2.0.js" />
        <asset:javascript src="vendor/modernizr-2.8.3.min.js" />
        <asset:javascript src="application.js" />
        <g:layoutHead/>
    </head>
    <body>
        <g:render template="/common/header" />
        <div class="container" id="main">
            <main role="main"><g:layoutBody/></main>
            <g:render template="/common/footer" />
            <div id="spinner" class="spinner" style="display:none;">
                <g:message code="spinner.alt" default="Loading&hellip;" />
            </div>
        </div>
    </body>
</html>


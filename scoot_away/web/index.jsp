
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scoot Away</title>
        <script language="JavaScript" type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <script>
            var formData = {
                
            };
            $.ajax({
                type: 'GET',
                url: 'json/retrieveCoordinates',
                dataType: 'json',
                data: formData,
                success: function (data) {
                    //alert(data);
                    var output = '<table border="1px"><tr><th>Latitude</th><th>Longitude</th></tr>';
                    var listOfCoordinates = data.listOfCoordinates;
                    
                    for(var i = 0; i < listOfCoordinates.length; i++){
                        output += '<tr>';
                        output += '<td>' + listOfCoordinates[i].latitude + '</td><td>' + listOfCoordinates[i].longitude +'</td>';
                        output += '</tr>';
                    }
                    
                    output += '</table>';
                    $('#heatMapDisplay').html(output);
                }
            });
        </script>
        <div id="heatMapDisplay" name="heatMapDisplay"></div>
        
        <script>
            var formData = {
                
            };
            $.ajax({
                type: 'GET',
                url: 'json/retrieveSpeedingCase',
                dataType: 'json',
                data: formData,
                success: function (data) {
                    //alert(data);
                    var output = '<table border="1px"><tr><th>Date</th><th>Speeding</th></tr>';
                    var listOfSpeedingCases = data.listOfSpeedingCases;
                    
                    for(var i = 0; i < listOfSpeedingCases.length; i++){
                        output += '<tr>';
                        output += '<td>' + listOfSpeedingCases[i].date + '</td><td>' + listOfSpeedingCases[i].noOfSpeeding +'</td>';
                        output += '</tr>';
                    }
                    
                    output += '</table>';
                    $('#calDisplay').html(output);
                }
            });
        </script>
        <div id="calDisplay" name="calDisplay"></div>
    </body>
</html>

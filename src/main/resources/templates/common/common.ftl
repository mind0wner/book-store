<#macro page>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Store</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

    </head>
    <body>
    <div class="w3-container w3-blue-grey w3-opacity w3-right-align">
        <h1>Book Store</h1>
    </div>
    <div class="w3-container w3-center">
        <div class="w3-bar w3-padding-large w3-padding-24">
            <button class="w3-btn w3-hover-yellow w3-round-large" onclick="location.href='/'">Main Page</button>
            <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/books'">List of books
            </button>
            <button class="w3-btn w3-hover-light-blue w3-round-large" onclick="location.href='/books/add'">Add a book
            </button>
        </div>
    </div>
    <#nested>
    </body>
    </html>
</#macro>
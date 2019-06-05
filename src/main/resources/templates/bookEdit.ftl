<#import "common/common.ftl" as c>

<@c.page>
    <h2>Edit a book</h2>
    <form action="/books" method="post">
        <div><label>Title: <input type="text" name="title" value="${book.getTitle()}"></label></div>
        <br/>
        <div><label>Author: <input type="text" name="author" value="${book.getAuthor()}"></label></div>
        <br/>
        <div><label>Price: <input type="text" name="price" value="${book.getPrice()}"></label></div>
        <#--<input type="hidden" value="${_csrf.token}" name="_csrf">-->
        <input type="hidden" value="${book.getId()}" name="id">
        <div><input type="submit" value="Save"/></div>
    </form>
</@c.page>
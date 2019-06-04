<#import "common/common.ftl" as c>

<@c.page>
    <div align="center">
        <h2>Add new book</h2>
    </div>
    ${msg?if_exists}
    <form class="a" method="post" action="/books/add">
        <div><label> Title: <input type="text" name="title"/> </label></div>
        <div><label> Author: <input type="text" name="author"/> </label></div>
        <div><label> Price: <input type="text" name="price"/> </label></div>
        <#--<input type="hidden" name="_csrf" value="${_csrf.token}" />-->
        <div class="btn"><input type="submit" value="Add"/></div>
    </form>
</@c.page>
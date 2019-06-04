<#import "common/common.ftl" as c>

<@c.page>
    <#if books?has_content>
    <div align="center"><h2>Available books</h2></div>

        <table align="center" style="width: 40%" border="1" cellspacing="0">
        <th>Title</th>
        <th>Author</th>
        <th>Price</th>
        <th>Edit</th>
        <th>Delete</th>
        <#list books as b>
                <tr>
                    <td align="center">${b.getTitle()}</td>
                    <td align="center">${b.getAuthor()}</td>
                    <td align="center">${b.getPrice()}</td>
                    <td align="center"><a href="/books/${b.getId()}">Edit</a></td>
                    <td align="center"><a href="/books/remove/${b.getId()}">Delete</a></td>
                </tr>
        </#list>
    </table>
<#else >
    <h1 align="center">No books yet</h1>
</#if>

</@c.page>
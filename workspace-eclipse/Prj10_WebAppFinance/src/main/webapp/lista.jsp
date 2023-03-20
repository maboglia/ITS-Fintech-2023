

<h1><%= request.getAttribute("titoloPagina") %></h1>

<table>
  <tr>
    <th>Titolo</th>
    <th>Valore</th>
  </tr>

<% String[] titoli = (String[]) request.getAttribute("elencoAzioni"); %>

<% for (String titolo : titoli) { %>  

  <tr>
    <td><%= titolo %></td>
    <td>0.50</td>
  </tr>

<% } %>

</table>




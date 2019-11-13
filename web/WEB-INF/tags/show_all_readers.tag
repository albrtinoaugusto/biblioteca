<%@tag import="model.Reader"%>
<%@tag import="dao.ReaderDAO"%>
<%@tag import="java.util.List"%>


            <%
                List<Reader> readers = new ReaderDAO().getReaders();

                if (readers.size() > 0)
                {
                    for (Reader reader: readers)
                    {
            %>
                        <tr>
                            <td><%out.print(reader.getReaderCode());%></td>
                            <td><%out.print(reader.getName());%></td>
                            <td><%out.print(reader.getSurname());%></td>
                            <td><%out.print(reader.getAddress());%></td>
                            <td><%out.print(reader.getContact());%></td>
                            <td><%out.print(reader.getBornPlace());%></td>
                            <td><%out.print(reader.getCategory());%></td>
                            <td>
                                
                                <a href="${pageContext.request.contextPath}/edituser">
                                    <button class="save-button-small btn-sm"> 
                                        <i class="fa fa-pencil"></i>
                                    </button>
                                </a>
                                    
                                
                                    &nbsp; &nbsp;   
                                    <a href="${pageContext.request.contextPath}/deletereader?id=<%out.print(reader.getReaderCode());%>">
                                        <button class="save-button-small btn-sm"> 
                                            <i class="fa fa-trash"></i>
                                        </button>
                                    </a>
                                
                            </td>
                        </tr>
            <%
                    }
                }
                else
                {
                    %><tr><td colspan="8"> Ainda sem leitores cadastrados...</td></tr><%
                }
            %>

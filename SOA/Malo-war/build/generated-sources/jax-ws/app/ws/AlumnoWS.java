
package app.ws;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AlumnoWS", targetNamespace = "http://ws.app/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AlumnoWS {


    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "remove", targetNamespace = "http://ws.app/", className = "app.ws.Remove")
    @Action(input = "http://ws.app/AlumnoWS/remove")
    public void remove(
        @WebParam(name = "entity", targetNamespace = "")
        Alumno entity);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "count", targetNamespace = "http://ws.app/", className = "app.ws.Count")
    @ResponseWrapper(localName = "countResponse", targetNamespace = "http://ws.app/", className = "app.ws.CountResponse")
    @Action(input = "http://ws.app/AlumnoWS/countRequest", output = "http://ws.app/AlumnoWS/countResponse")
    public int count();

    /**
     * 
     * @param id
     * @return
     *     returns app.ws.Alumno
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "find", targetNamespace = "http://ws.app/", className = "app.ws.Find")
    @ResponseWrapper(localName = "findResponse", targetNamespace = "http://ws.app/", className = "app.ws.FindResponse")
    @Action(input = "http://ws.app/AlumnoWS/findRequest", output = "http://ws.app/AlumnoWS/findResponse")
    public Alumno find(
        @WebParam(name = "id", targetNamespace = "")
        Object id);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "create", targetNamespace = "http://ws.app/", className = "app.ws.Create")
    @Action(input = "http://ws.app/AlumnoWS/create")
    public void create(
        @WebParam(name = "entity", targetNamespace = "")
        Alumno entity);

    /**
     * 
     * @param entity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "edit", targetNamespace = "http://ws.app/", className = "app.ws.Edit")
    @Action(input = "http://ws.app/AlumnoWS/edit")
    public void edit(
        @WebParam(name = "entity", targetNamespace = "")
        Alumno entity);

    /**
     * 
     * @return
     *     returns java.util.List<app.ws.Alumno>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://ws.app/", className = "app.ws.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://ws.app/", className = "app.ws.FindAllResponse")
    @Action(input = "http://ws.app/AlumnoWS/findAllRequest", output = "http://ws.app/AlumnoWS/findAllResponse")
    public List<Alumno> findAll();

    /**
     * 
     * @param range
     * @return
     *     returns java.util.List<app.ws.Alumno>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findRange", targetNamespace = "http://ws.app/", className = "app.ws.FindRange")
    @ResponseWrapper(localName = "findRangeResponse", targetNamespace = "http://ws.app/", className = "app.ws.FindRangeResponse")
    @Action(input = "http://ws.app/AlumnoWS/findRangeRequest", output = "http://ws.app/AlumnoWS/findRangeResponse")
    public List<Alumno> findRange(
        @WebParam(name = "range", targetNamespace = "")
        List<Integer> range);

}

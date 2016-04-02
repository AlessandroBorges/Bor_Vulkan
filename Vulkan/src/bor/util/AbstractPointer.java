/**
 * 
 */
package bor.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Alessandro Borges
 *
 */
@Deprecated
public abstract class AbstractPointer<T> implements Pinterface<T> {

    protected Class<T>  classofT;
    
    /**
     * Find the class type of E.
     * It uses reflection to figure out the type of E
     * 
     */      
    @SuppressWarnings("unchecked")
    protected void findClassTypeOfT(){
        
        Class<T> cz = (Class<T>) getClass();
        Type type = cz.getGenericSuperclass();
        Type[] typeArgs = ((ParameterizedType)type).getActualTypeArguments();
        System.out.println("Type " + typeArgs[0] );
        
        this.classofT = (Class<T>)
                ((ParameterizedType)getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];        
    }

}

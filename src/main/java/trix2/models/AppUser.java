package trix2.models;

import trix2.models.security.AclImpl;
import trix2.models.security.PrincipalImpl;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by misael on 17/10/2015.
 */
@Document
public class AppUser extends User{
    public AppUser(){
        this.id = new ObjectId().toHexString();
        principal = new PrincipalImpl(this.id);
        acl = new AclImpl(principal, this.id);
    }
}
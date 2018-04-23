package yxinfo.ow.inf.dto.mbr;


import yxinfo.ow.inf.dto.BaseDTO;

/**
 * Created by tj on 2016/9/2.
 */
public class RoleMenuDTO extends BaseDTO {

    private static final long serialVersionUID = 2703389244545809341L;

    private Integer id;

    //角色id
    private Integer roleId;

    //名称
    private String fname;

    //图标
    private String icon;

    //路由
    private String ref;

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId( Integer roleId ) {
        this.roleId = roleId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname( String fname ) {
        this.fname = fname;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon( String icon ) {
        this.icon = icon;
    }

    public String getRef() {
        return ref;
    }

    public void setRef( String ref ) {
        this.ref = ref;
    }
}

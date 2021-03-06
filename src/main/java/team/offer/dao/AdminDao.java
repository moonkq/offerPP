package team.offer.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import team.offer.entity.Admin;
import team.offer.entity.Company;
import team.offer.entity.User;

import java.util.List;

/**
 * @Author:L1ANN
 * @Description:
 * @Date:Created in 15:59 2018/1/19
 * @Modified By:
 */
@Repository
public interface AdminDao {
    //根据id查询管理员
    Admin findAdminById(int id) throws Exception;

    //查询不活跃的用户
    List<User> listInactiveUsers() throws Exception;

//    //查询指定的用户集
//    List<User> listBoundUsers() throws Exception;

    //删除用户
    Integer deleteUser(int id) throws Exception;

    //通过id找公司
    Company findCompanyById(int id) throws Exception;

    //找到所有没有审核过的公司（pass=null）
    List<Company> listNotPassCompanys() throws Exception;

    //修改具体公司的审核状态
    Integer modifyCompanyPass(@Param("value") int value, @Param("id") int id) throws  Exception;

    //找到所有的企业
    List<Company> findAllCompanys() throws Exception;

    //修改具体企业的岗位发布上限
    Integer setPositionLimit(@Param("limit") int limit, @Param("id") int id) throws Exception;

    //管理员修改密码
    Integer adminModifyPassword(@Param("id") int id, @Param("password") String password) throws Exception;
}

package com.qf.service.Impl;


import com.qf.entity.Address;
import com.qf.entity.Area;
import com.qf.entity.User;
import com.qf.mapper.AddressMapper;
import com.qf.mapper.AreaMapper;
import com.qf.mapper.UserMapper;
import com.qf.service.SysUserService;
import com.qf.utils.R;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service(value = "sysUserServiceImpl" )
public class SysUserServiceImpl implements SysUserService {


    @Resource
    private UserMapper userMapper;

    @Resource
    private AddressMapper addressMapper;

    @Resource
    private AreaMapper areaMapper;

    //用户信息
    @Override
    public User message(int userId) {

        return  userMapper.selectByPrimaryKey(userId);
}

    @Override
    public R findUsername(String username) {


            User user1 =userMapper.selectByuserName(username);
            if(user1!=null){
                return R.error("用户名已存在");
            }
        return R.ok();
    }

    //更新用户数据
    @Override
    public R updateuser(User user) {

        int i =userMapper.updateByPrimaryKeySelective(user);
        if (i>0){
            return R.ok();
        }
        return R.error("修改失败");
    }

    //所有用户地址
    @Override
    public R findAll(int userId) {

        List<Address> list =  addressMapper.findByuserid(userId);

        return R.ok().put("addressList",list);
    }

    //删除收货地址
    @Override
    public R deladdress(int addressid) {
        int i =addressMapper.deleteByPrimaryKey(addressid);
        if (i>0){
            return R.ok();
        }
        return R.error("删除失败");
    }

    //修改默认地址
    @Override
    public R defultaddr(Address address) {

       int defauitage = addressMapper.updateByisDefauit(address.getUserid());
        int defauitnow = addressMapper.updateByisDefauitnew(address.getAddressid());

        if (defauitage>0&&defauitnow>0){
            return R.ok();
        }
        return R.error("修改默认地址失败");
    }

    //添加收货地址
    @Override
    public R addaddr(Address address) {
        if(address.getIsdefauit()>0){
            addressMapper.updateByisDefauit(address.getUserid());
        }
        int count = addressMapper.numByUserid(address.getUserid());

        if(count>4){

            System.out.println(count+"skldfjjksdhgjksfhgfjkdsahgjksa");
            return R.error("收货地址限制最多5个");
        }
       int i =addressMapper.insert(address);
        if (i>0){



            return R.ok();
        }
        return R.error("添加失败");
    }

    //修改收货地址
    @Override
    public R updateaddr(Address address) {

        if(address.getIsdefauit()!=null&&address.getIsdefauit()>0){
            addressMapper.updateByisDefauit(address.getUserid());
        }

        int i=addressMapper.updateByPrimaryKeySelective(address);
        if (i>0){
            return R.ok();
        }
        return R.error("地址修改失败");

    }




    @Override
    public R addrprovince(int parentId) {

        List<Area> list =  areaMapper.findprovince(parentId);

        return R.ok().put("provincelist",list);

    }

    @Override
    public R addrcity(int parentId) {
        List<Area> list =  areaMapper.findprovince(parentId);

        return R.ok().put("citylist",list);
    }

    @Override
    public R addrcounty(int parentId) {
        List<Area> list =  areaMapper.findprovince(parentId);

        return R.ok().put("countlist",list);
    }


}

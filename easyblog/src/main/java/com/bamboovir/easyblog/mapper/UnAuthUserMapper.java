package com.bamboovir.easyblog.mapper;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.bamboovir.easyblog.model.User;

@Mapper
public interface UnAuthUserMapper {

	@Insert("insert into unauthuser(id,type,gender,username,fullname,firstname,lastname,"
			+ "email,"
			+ "phonenumber,gplusurl,domainurl,twitterurl,facebookurl,createdat,"
			+ "country,imagemediumurl,imagesmallurl,imagelargeurl,posts,authid,passwdmd5) values"
			+ "(#{id},#{type},#{gender},#{username},#{fullname},#{firstname},#{lastname},#{email},"
			+ "#{phonenumber},#{gplusurl},#{domainurl},#{twitterurl},#{facebookurl},#{createdat},"
			+ "#{country},#{imagemediumurl},#{imagesmallurl},#{imagelargeurl},#{posts},#{authid},#{passwdmd5});")
	void insertUnAuthUser(@Param("id")String id,
			@Param("type")String type,
			@Param("gender")String gender,
			@Param("username")String username,
			@Param("fullname")String fullname,
			@Param("firstname")String firstname,
			@Param("lastname")String lastname,
			@Param("email")String email,
			@Param("phonenumber")String phonenumber,
			@Param("gplusurl")String gplusurl,
			@Param("domainurl")String domainurl,
			@Param("twitterurl")String twitterurl,
			@Param("facebookurl")String facebookurl,
			@Param("createdat")Long createdat,
			@Param("country")String country,
			@Param("imagemediumurl")String imagemediumurl,
			@Param("imagesmallurl")String imagesmailurl,
			@Param("imagelargeurl")String imagelargeurl,
			@Param("posts")Integer posts,
			@Param("authid")String authid,
			@Param("passwdmd5")String passwdmd5);
	
	@Select("select id as id, type as type,gender as gender,username as username,"
			+ "fullname as fullName,firstname as firstName,lastname as lastName,"
			+ "email as email,"
			+ "phonenumber as phoneNumber,gplusurl as gplusUrl,"
			+ "domainurl as domainUrl,twitterurl as twitterUrl,facebookurl as facebookUrl,"
			+ "createdat as createdAt,country as country,"
			+ "imagemediumurl as imageMediumUrl,"
			+ "imagesmallurl as imageSmailUrl ,imagelargeurl as imageLargeUrl,"
			+ "posts as posts, authid as authId , passwdmd5 as passwdMD5 from unauthuser where id = #{id}")
	User getUnAuthUserById(@Param("id")String id);
	

	@Select("select id as id, type as type,gender as gender,username as username,"
			+ "fullname as fullName,firstname as firstName,lastname as lastName,"
			+ "email as email,"
			+ "phonenumber as phoneNumber,gplusurl as gplusUrl,"
			+ "domainurl as domainUrl,twitterurl as twitterUrl,facebookurl as facebookUrl,"
			+ "createdat as createdAt,country as country,"
			+ "imagemediumurl as imageMediumUrl,"
			+ "imagesmallurl as imageSmailUrl ,imagelargeurl as imageLargeUrl,"
			+ "posts as posts, authid as authId , passwdmd5 as passwdMD5 from unauthuser where username = #{username}")
	User getUnAuthUserByUserName(String userName);
	
	@Select("select id as id, type as type,gender as gender,username as username,"
			+ "fullname as fullName,firstname as firstName,lastname as lastName,"
			+ "email as email,"
			+ "phonenumber as phoneNumber,gplusurl as gplusUrl,"
			+ "domainurl as domainUrl,twitterurl as twitterUrl,facebookurl as facebookUrl,"
			+ "createdat as createdAt,country as country,"
			+ "imagemediumurl as imageMediumUrl,"
			+ "imagesmallurl as imageSmailUrl ,imagelargeurl as imageLargeUrl,"
			+ "posts as posts, authid as authId , passwdmd5 as passwdMD5 from unauthuser where email = #{email}")
	User findUnAuthUserByEmail(@Param("email")String email);
	
	@Update("UPDATE unauthuser SET type=#{type} WHERE id=#{id}")
	void updateUserTypeByID(@Param("type") String type , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET gender=#{gender} WHERE id=#{id}")
	void updateUserGenderByID(@Param("gender") String gender , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET fullname=#{fullname} WHERE id=#{id}")
	void updateUserFullnameByID(@Param("fullname") String fullname , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET firstname=#{firstname} WHERE id=#{id}")
	void updateUserFirstnameByID(@Param("firstname") String firstname , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET lastname=#{lastname} WHERE id=#{id}")
	void updateUserLastnameByID(@Param("lastname") String lastname , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET email=#{email} WHERE id=#{id}")
	void updateUserEmailByID(@Param("email") String email , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET phonenumber=#{phonenumber} WHERE id=#{id}")
	void updateUserPhonenumberByID(@Param("phonenumber") String phonenumber , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET gplusUrl=#{gplusUrl} WHERE id=#{id}")
	void updateUserGplusUrlByID(@Param("gplusUrl") String gplusUrl , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET domainUrl=#{domainUrl} WHERE id=#{id}")
	void updateUserDomainUrlByID(@Param("domainUrl") String domainUrl , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET twitterUrl=#{twitterUrl} WHERE id=#{id}")
	void updateUserTwitterUrlByID(@Param("twitterUrl") String twitterUrl , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET facebookUrl=#{facebookUrl} WHERE id=#{id}")
	void updateUserFacebookUrlByID(@Param("facebookUrl") String facebookUrl , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET country=#{country} WHERE id=#{id}")
	void updateUserCountryByID(@Param("country") String country , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET imagemediumurl=#{imagemediumurl} WHERE id=#{id}")
	void updateUserImageMediumUrlByID(@Param("imagemediumurl") String imagemediumurl , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET imagesmallurl=#{imagesmallurl} WHERE id=#{id}")
	void updateUserImageSmallUrlByID(@Param("imagesmallurl") String imagesmallurl , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET posts=#{posts} WHERE id=#{id}")
	void updateUserPostsByID(@Param("posts") Integer posts , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET authId=#{authId} WHERE id=#{id}")
	void updateUserAuthIdByID(@Param("authId") String authId , @Param("id") String id);
	
	@Update("UPDATE unauthuser SET passwdMD5=#{passwdMD5} WHERE id=#{id}")
	void updateUserPasswdMD5ByID(@Param("passwdMD5") String passwdMD5 , @Param("id") String id);
	
	@Delete("DELETE FROM unauthuser WHERE 1=1")
	void deleteAllUnAuthUser();
	
	@Delete("DELETE FROM unauthuser WHERE id=#{id}")
	void deleteUnAuthUserByID(@Param("id")String id);
				
	@Update("CREATE TABLE `easyblog`.`unauthuser` (\r\n" + 
			"  `id` VARCHAR(100) NOT NULL,\r\n" + 
			"  `type` VARCHAR(45) NOT NULL,\r\n" + 
			"  `gender` VARCHAR(45) NOT NULL,\r\n" + 
			"  `username` VARCHAR(45) NOT NULL,\r\n" + 
			"  `fullname` VARCHAR(45) NOT NULL,\r\n" + 
			"  `firstname` VARCHAR(45) NOT NULL,\r\n" + 
			"  `lastname` VARCHAR(45) NOT NULL,\r\n" + 
			"  `email` VARCHAR(45) NOT NULL,\r\n" + 
			"  `phonenumber` VARCHAR(45) NOT NULL,\r\n" + 
			"  `gplusurl` VARCHAR(100) NOT NULL,\r\n" + 
			"  `domainurl` VARCHAR(100) NOT NULL,\r\n" + 
			"  `twitterurl` VARCHAR(100) NOT NULL,\r\n" + 
			"  `facebookurl` VARCHAR(100) NOT NULL,\r\n" + 
			"  `createdat` BIGINT UNSIGNED NOT NULL,\r\n" + 
			"  `country` VARCHAR(45) NOT NULL,\r\n" + 
			"  `imagemediumurl` VARCHAR(100) NOT NULL,\r\n" + 
			"  `imagesmallurl` VARCHAR(100) NOT NULL,\r\n" + 
			"  `imagelargeurl` VARCHAR(100) NOT NULL,\r\n" + 
			"  `posts` INTEGER UNSIGNED NOT NULL,\r\n" + 
			"  `authid` VARCHAR(100) NOT NULL,\r\n" + 
			"  `passwdmd5` VARCHAR(100) NOT NULL,\r\n" + 
			"  PRIMARY KEY (`id`)\r\n" + 
			")\r\n" + 
			"ENGINE = InnoDB;")
	void createUnAuthUserTable();
	
	@Update("drop table unauthuser;")
	void deleteUnAuthUserTable();

}

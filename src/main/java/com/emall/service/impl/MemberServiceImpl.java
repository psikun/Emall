package com.emall.service.impl;

import com.emall.entity.Member;
import com.emall.mapper.MemberMapper;
import com.emall.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberMapper memberMapper;
    @Override
    public Member getMemberById(int id){return memberMapper.getMemberById( id);};
    @Override
    public List<Member> list(){return memberMapper.list();};
    @Override
    public int add(Member member){return memberMapper.add(member);};
    @Override
    public int update(Member member){return memberMapper.update(member);};
    @Override
    public int delete(int id){return memberMapper.deleteById(id);};

}

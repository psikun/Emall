package com.emall.service;

import com.emall.entity.Member;

import java.util.List;

public interface MemberService {
    Member getMemberById(int id);

    List<Member> list();

    int add(Member member);

    int update(Member member);

    int delete(int id);

}

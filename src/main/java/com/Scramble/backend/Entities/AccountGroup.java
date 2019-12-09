//package com.Scramble.backend.Entities;
//
//import javax.persistence.Entity;
//import javax.persistence.ManyToMany;
//import javax.persistence.MapsId;
//
//@Entity
//public class AccountGroup {
//    @ManyToMany
//    @MapsId("idAccount")
//    private long accountId;
//
//    @ManyToMany
//    @MapsId("idGroup")
//    private long groupId;
//
//    public AccountGroup(long accountIdAccount, long groupIdGroup) {
//        this.accountId = accountIdAccount;
//        this.groupId = groupIdGroup;
//    }
//
//    public long getAccountIdAccount() {
//        return accountId;
//    }
//
//    public void setAccountIdAccount(long accountIdAccount) {
//        this.accountId = accountIdAccount;
//    }
//
//    public long getGroupIdGroup() {
//        return groupId;
//    }
//
//    public void setGroupIdGroup(long groupIdGroup) {
//        this.groupId = groupIdGroup;
//    }
//}

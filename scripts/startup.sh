#!/bin/sh
base_dir=$(cd `dirname $0`;pwd)
parent_dir=$(cd `dirname $base_dir`;pwd)
CLASSPATH=.:$parent_dir/lib/*
MAIN_CLASS=com.wangwenjun.java.Routers
nohup /opt/jdk1.8.0_201/bin/java -cp $CLASSPATH:$parent_dir/config/* $MAIN_CLASS &
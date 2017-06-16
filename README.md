# XLog

[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[ ![Download](https://api.bintray.com/packages/brightmi/maven/cclog/images/download.svg) ](https://bintray.com/brightmi/maven/cclog/_latestVersion)

> 一个简单的log工具类（主要学习如何上传library到jCenter）


## 1. 如何添加

#### 在app目录下的build.gradle中添加依赖

```gradle
compile 'com.mi.utils:cclog:1.0.1'
```

## 2. 设置是否输出信息

#### 在项目的Application或入口处

```
CCLog.debug(true); //true:输出log信息 false:不输出log
```

```
CCLog.debug("defineTagName",true); //第一个参数：自定义tag名
```

## 3. 直接使用

#### 常见Log打印级别信息

```
CCLog.d("message")
CCLog.e("message")
CCLog.i("message")
...
```
```
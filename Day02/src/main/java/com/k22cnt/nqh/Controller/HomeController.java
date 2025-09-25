package com.k22cnt.nqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
<!doctype html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<meta name="viewport"
        content="width=device-width, user-scalable=no,
        initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Giới thiệu Thymeleaf</title>

<!-- CSS -->
<link th:href="@{/css/bootstrap.min.css}" rel="stylesheet"/>
</head>
<body>

<!-- Nội dung sẽ đặt ở đây -->

<!-- JavaScript -->
<script th:src="@{/js/bootstrap.bundle.min.js}"></script>
</body>
</html>
        "https://devmaster.edu.vn"));
// Đưa profile vào model
        model.addAttribute("DevmasterProfile", profile);
        return "profile";
   }
}
package com.ccr.designpattern.creational.builder.v2;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

/**
 * 课程对象包含 name ppt video article
 * <p>
 * 使用builder模式创建对象
 */
public class Course {

    private String name;
    private String ppt;
    private String video;
    private String article;

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.ppt = courseBuilder.ppt;
        this.video = courseBuilder.video;
        this.article = courseBuilder.article;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", article='" + article + '\'' +
                '}';
    }

    public static class CourseBuilder {
        private String name;
        private String ppt;
        private String video;
        private String article;

        public CourseBuilder builderName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder builderPpt(String ppt) {
            this.ppt = ppt;
            return this;
        }

        public CourseBuilder builderVideo(String video) {
            this.video = video;
            return this;
        }

        public CourseBuilder builderArticle(String article) {
            this.article = article;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderName("test").build();
        System.out.println(course);

        Set<String> set = ImmutableSet.<String>builder().add("a").add("c").build();
        System.out.println(set);
    }
}

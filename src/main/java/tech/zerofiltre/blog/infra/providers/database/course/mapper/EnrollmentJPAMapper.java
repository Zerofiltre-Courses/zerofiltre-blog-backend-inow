package tech.zerofiltre.blog.infra.providers.database.course.mapper;

import org.mapstruct.*;
import tech.zerofiltre.blog.domain.course.model.*;
import tech.zerofiltre.blog.infra.providers.database.course.model.*;
import tech.zerofiltre.blog.infra.providers.database.user.mapper.*;

@Mapper(uses = {CourseJPAMapper.class, UserJPAMapper.class, LessonJPAMapper.class})
public interface EnrollmentJPAMapper {

    EnrollmentJPA toJPA(Enrollment enrollment);

    Enrollment fromJPA(EnrollmentJPA enrollmentJPA);
}

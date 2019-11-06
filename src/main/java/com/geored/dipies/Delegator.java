package com.geored.dipies;




/**
 * EXAMPLE:
 *
 * class ValidatorHelper implements Validator {
 *     Set<Validator> delegates;
 *
 *     bool validate(Object o) {
 *         for (Validator v : delegates) {
 *             if (!v.validate(o)) return false
 *         }
 *         return true
 *     }
 * }
 * class RestController {
 *     ValidationHelper helper;
 *     Response addObject(Object o) {
 *         if (helper.validate(o)) return ErrorResponse
 *         // Normal processing
 *     }
 * }
 *
 *
 * @author Georgievski Georgy
 *
*/
public interface Delegator {
    
    boolean validate(Object o);
}

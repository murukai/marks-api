package com.mufakose.students.marksapi.controller;

import com.mufakose.students.marksapi.entity.Address;
import com.mufakose.students.marksapi.entity.Link;
import com.mufakose.students.marksapi.entity.Student;
import com.mufakose.students.marksapi.repository.AddressRepository;
import com.mufakose.students.marksapi.repository.LinkRepository;
import com.mufakose.students.marksapi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mumu on 2/12/2018.
 */
@RestController
@RequestMapping("/addresses")
public class AddressesRestController {


    private StudentRepository studentRepository;
    private LinkRepository linkRepository;
    private AddressRepository addressRepository;

    public AddressesRestController(@Autowired StudentRepository studentRepository, @Autowired AddressRepository addressRepository,
                                   @Autowired LinkRepository linkRepository){
        this.studentRepository = studentRepository;
        this.addressRepository = addressRepository;
        this.linkRepository = linkRepository;
    }

    @RequestMapping(path = "/students/{studentID}/addresses", method = RequestMethod.GET)
    public List<Address> getStudentAddresses(@PathVariable String studentID){
        Student student = studentRepository.findByStudentID(studentID);
        return addressRepository.findByStudent(student);
    }

    @RequestMapping(path = "/students/addresses",method = RequestMethod.POST)
    public Address addAddress(@RequestBody Address address){
        return addressRepository.save(address);
    }

    @RequestMapping(path = "/students/addresses",method = RequestMethod.PUT)
    public Address updateAddress(@RequestBody Address address){
        return addressRepository.save(address);
    }

    @RequestMapping(path = "/students/addresses",method = RequestMethod.DELETE)
    public void deleteAddress(@RequestBody Address address){
        addressRepository.delete(address);
    }

    @RequestMapping(path = "/students/addresses/{addressId}/delete",method = RequestMethod.POST)
    public void deleteAddress(@PathVariable long addressId){
        addressRepository.deleteById(addressId);
    }


    @RequestMapping(path = "/students/addresses/{addressId}/links", method = RequestMethod.PUT)
    public Link updateStudentSocialLinks(@PathVariable long addressId, @RequestBody Link link){
        Address address = addressRepository.findById(addressId).get();
        link.setAddress(address);
        return linkRepository.save(link);
    }

    @RequestMapping(path = "/students/addresses/{addressId}/links", method = RequestMethod.POST)
    public Link addStudentSocialLinks(@PathVariable long addressId, @RequestBody Link link){
        Address address = addressRepository.findById(addressId).get();
        link.setAddress(address);
        return linkRepository.save(link);
    }

    @RequestMapping(path = "/students/addresses/{addressId}/links", method = RequestMethod.DELETE)
    public void deleteStudentSocialLinks(@PathVariable long addressId, @RequestBody Link link){
        Address address = addressRepository.findById(addressId).get();
        link.setAddress(address);
        linkRepository.delete(link);
    }
}

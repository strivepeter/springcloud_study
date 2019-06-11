package com.peter.controller;import com.peter.entities.Dept;import com.peter.sevice.DeptService;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.cloud.client.ServiceInstance;import org.springframework.cloud.client.discovery.DiscoveryClient;import org.springframework.web.bind.annotation.*;import java.util.List;/** * @ClassName DeptController * @Description TODO * @Auther peter * @Date 2019-06-09 23:28 * @Version 1.1.0 */@RestControllerpublic class DeptController{    @Autowired    private DeptService service;    @Autowired    private DiscoveryClient client;    @RequestMapping(value="/dept/add",method= RequestMethod.POST)    public boolean add(@RequestBody Dept dept)    {        return service.add(dept);    }    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)    public Dept get(@PathVariable("id") Long id)    {        return service.get(id);    }    @RequestMapping(value="/dept/list",method=RequestMethod.GET)    public List<Dept> list()    {        return service.list();    }    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)    public Object discovery()    {        List<String> list = client.getServices();        System.out.println("***********"+list);        List<ServiceInstance> srvList = client.getInstances("DEPT_PROVIDER");        for (ServiceInstance serviceInstance : srvList) {            System.out.println(serviceInstance.getServiceId()+serviceInstance.getHost()+serviceInstance.getMetadata()            +serviceInstance.getUri());        }        return this.client;    }}
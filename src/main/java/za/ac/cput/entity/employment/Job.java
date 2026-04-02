package za.ac.cput.entity.employment;

public class Job {
    private String jobTitle;
    private String jobDesc;

    private Job(Builder builder){
        this.jobTitle = builder.jobTitle;
        this.jobDesc = builder.jobDesc;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                ", jobDesc='" + jobDesc + '\'' +
                '}';
    }
    public static class Builder{
        private String jobTitle;
        private String jobDesc;

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public Builder setJobDesc(String jobDesc) {
            this.jobDesc = jobDesc;
            return this;
        }
        public Builder copy(Job jobDetails){
            this.jobTitle = jobDetails.jobTitle;
            this.jobDesc = jobDetails.jobDesc;
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }
}

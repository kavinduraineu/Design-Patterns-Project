export interface User {
  id: number;
  username: string;
  email: string;
}

export interface Application {
  id: number;
  companyName: string;
  roleName: string;
  jobType: 'FULLTIME' | 'INTERNSHIP' | 'CONTRACT';
  applicationDate: string;
  status: 'APPLIED' | 'OA' | 'INTERVIEW' | 'OFFER' | 'REJECTED' | 'WITHDRAWN';
  notes: string;
  referralInfo: string | null;
  salaryDetails: number | null;
  interviewNotes: string | null;
}

export interface DashboardData {
  totalApplications: number;
  statusBreakdown: Record<string, number>;
  successRate: number;
  applicationsOverTime: Record<string, number>;
  applicationsByType: Record<string, number>;
}

export interface Reminder {
  id: number;
  reminderDate: string;
  message: string;
  completed: boolean;
}